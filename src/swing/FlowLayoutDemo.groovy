package swing

bldr = new groovy.swing.SwingBuilder()

frame = bldr.frame (
    title : 'FlowLayout Demo',
    layout : bldr.flowLayout (alignment : java.awt.FlowLayout.CENTER),
    size : [600, 100],
    defaultCloseOperation : javax.swing.WindowConstants.EXIT_ON_CLOSE
) {
    btn1 = button(text : "1")
    btn2 = button(text : "2")
    btn3 = button(text : "3")
    btn4 = button(text : "4")
    btn5 = button(text : "5")
    btn6 = button(text : "6")
}

frame.show()

