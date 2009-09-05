bldr = new groovy.xml.MarkupBuilder()

bldr.languages {
    language(name : 'C++') { author('Stroustrup') }
    language(name : 'Java') { author('Gosling') }
    language(name : 'Lisp') { author('McCarthy') }
}
