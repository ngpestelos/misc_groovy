package meta

class Foo {

    static def findById(x) { }

    static def findById(x, y) { }

}

println Foo.metaClass.getStaticMetaMethod("findById", [Object, Object])
