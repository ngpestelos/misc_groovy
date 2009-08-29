System.setProperty('user.timezone', 'GMT')

def today = new Date()
println "GMT ${today}"

GregorianCalendar.metaClass.getYear    = { -> delegate.get(Calendar.YEAR) }
GregorianCalendar.metaClass.getMonth   = { -> delegate.get(Calendar.MONTH) + 1}
GregorianCalendar.metaClass.getDay     = { -> delegate.get(Calendar.DAY_OF_MONTH) }
GregorianCalendar.metaClass.getHour    = { -> delegate.get(Calendar.HOUR_OF_DAY) }
GregorianCalendar.metaClass.getMinute  = { -> delegate.get(Calendar.MINUTE) }
GregorianCalendar.metaClass.getSecond  = { -> delegate.get(Calendar.SECOND) }

def c = Calendar.instance
println "Time ${c.time}"
println "Year ${c.year}"
println "Month ${c.month}"
println "Day ${c.day}"
println "Hour ${c.hour}"
println "Minute ${c.minute}"
println "Second ${c.second}"
println "${c.year}" + "${c.month}".padLeft(2,'0') + "${c.day}".padLeft(2,'0') + "${c.hour}".padLeft(2,'0') + "${c.minute}".padLeft(2,'0') + "${c.second}".padLeft(2,'0') 

println String.format('%tY%<tm%<td%<tH%<tM%<tS', c)
