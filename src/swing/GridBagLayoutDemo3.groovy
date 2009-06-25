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
    constraints.gridx = 0
    constraints.gridy = 1

    four = button(text : "4")
    aLayout.setConstraints(four, constraints)
    constraints.gridx = java.awt.GridBagConstraints.RELATIVE
    five = button(text : "5")
    aLayout.setConstraints(five, constraints)
    constraints.gridx = java.awt.GridBagConstraints.RELATIVE
    six = button(text : "6")
    aLayout.setConstraints(six, constraints)
    constraints.gridx = 0
    constraints.gridy = 2

    seven = button(text : "7", actionPerformed : { println("Seventh Button Pressed") })
    aLayout.setConstraints(seven, constraints)
    constraints.gridx = java.awt.GridBagConstraints.RELATIVE
    eight = button(text : "8")
    aLayout.setConstraints(eight, constraints)
    constraints.gridx = java.awt.GridBagConstraints.RELATIVE
    nine = button(text : "9")
    aLayout.setConstraints(nine, constraints)

}

frame.show()
