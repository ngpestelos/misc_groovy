package swing

import javax.swing.*
import java.awt.*

bldr = new groovy.swing.SwingBuilder()

frame = bldr.frame (
    title : "BorderLayout Demo",
    layout : bldr.borderLayout(),
    defaultCloseOperation : javax.swing.WindowConstants.EXIT_ON_CLOSE,
    size : [320, 200]
) {
    btn1 = button(text : "1", constraints : BorderLayout.NORTH)
    btn2 = button(text : "2", constraints : BorderLayout.SOUTH)
    btn3 = button(text : "3", constraints : BorderLayout.WEST)
    btn4 = button(text : "4", constraints : BorderLayout.EAST)
    btn5 = button(text : "5", constraints : BorderLayout.CENTER)
}

frame.show()