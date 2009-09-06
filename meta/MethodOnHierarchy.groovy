daysFromNow = { ->
  Calendar today = Calendar.instance
  today.add(Calendar.DAY_OF_MONTH, (int)delegate)
  today.time
}

Integer.metaClass.daysFromNow = daysFromNow
Long.metaClass.daysFromNow = daysFromNow

println 5.daysFromNow()
println 5L.daysFromNow()
