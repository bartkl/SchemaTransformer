package schematransformer

import org.eclipse.rdf4j.model.IRI
import org.eclipse.rdf4j.model.Model
import org.eclipse.rdf4j.model.Resource
import org.eclipse.rdf4j.model.Statement
import org.eclipse.rdf4j.model.vocabulary.RDF
import schematransformer.vocabulary.DXPROFILE


//fun Model.

fun Model.getProfileIRIs(): Set<Resource> = this.filter(null, RDF.TYPE, DXPROFILE.PROFILE).subjects()
fun Model.getResourceStatementss(profileIri: IRI): List<Statement> {
    val resourceIRIs = this.filter(null, DXPROFILE.HASRESOURCE, null).objects()
    return this.filter { it.subject in resourceIRIs }
}
fun Model.getResourceStatements(profileIri: IRI): List<Statement> =
    this.filter { it.subject in this.filter(null, DXPROFILE.HASRESOURCE, null).objects() }


//fun assignSchemaNamedGraphs(model: Model): Any {
//    val profileIRIs =
//        model.filter { it.predicate == RDF.TYPE && it.`object` == DXPROFILE.PROFILE }.map {
//            it.subject
//        }
//
//    for (profileIri in profileIRIs) {
//        val resources = getResourceStatements(model, profileIri as IRI)
//        println()
//    }
//
//    return 1
//}