package swing

bldr = new groovy.swing.SwingBuilder()

aLayout = bldr.gridBagLayout()

frame = bldr.frame (
    title : 'GridBagLayout Demo',
    layout : aLayout,
    defaultCloseOperation : javax.swing.WindowConstants.EXIT_ON_CLOSE,
    size : [700, 100]
) {
    constraints = new java.awt.GridBagConstraints()
    one = button(text : "1")
    aLayout.setConstraints(one, constraints)
    two = button(text : "2")
    aLayout.setConstraints(two, constraints)
    three = button(text : "3")
    aLayout.setConstraints(three, constraints)
    four = button(text : "4")
    aLayout.setConstraints(four, constraints)
    five = button(text : "5")
    aLayout.setConstraints(five, constraints)
    six = button(text : "6")
    aLayout.setConstraints(six, constraints)
    seven = button(text : "7", actionPerformed : { println("Seventh Button Pressed") })
    aLayout.setConstraints(seven, constraints)
    eight = button(text : "8")
    aLayout.setConstraints(eight, constraints)
    nine = button(text : "9")
    aLayout.setConstraints(nine, constraints)
}

frame.show()
