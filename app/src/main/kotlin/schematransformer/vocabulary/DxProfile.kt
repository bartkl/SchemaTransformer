package schematransformer.vocabulary

import org.eclipse.rdf4j.model.util.Values

object DXPROFILE {
    val NS = Values.iri("http://www.w3.org/ns/dx/prof/")  // TODO: Repetition of `Values.iri` is annoying.
    val PROFILE = Values.iri("http://www.w3.org/ns/dx/prof/Profile")
    val HASRESOURCE = Values.iri("http://www.w3.org/ns/dx/prof/hasResource")
    val HASARTIFACT = Values.iri("http://www.w3.org/ns/dx/prof/hasArtifact")
    val HASROLE = Values.iri("http://www.w3.org/ns/dx/prof/hasRole")
}
