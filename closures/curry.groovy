def tellFortunes(closure) {

  def date = new Date("09/06/2009 14:00:00")

  postFortune = closure.curry(date)

  postFortune "Your day is filled with ceremony"
  postFortune "They're features, not bugs"

}

tellFortunes() { date, fortune ->
  println "Fortune for ${date} is '${fortune}'"
}
