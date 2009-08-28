// http://www.nabble.com/add-classpath-entry-relative-to-script--Something-like-Ruby%27s-__FILE__--td20538884.html

// I'm looking for something like Ruby's __FILE__

def f = new File(WhichDirectory.class.protectionDomain.codesource.location.path).absoluteFile.parentFile
println f
