package swing

bldr = new groovy.swing.SwingBuilder()

frame = bldr.frame (
    title : 'Progress Bar Demo',
    layout : bldr.flowLayout (alignment : java.awt.FlowLayout.CENTER),
    size : [400, 100],
    defaultCloseOperation : javax.swing.WindowConstants.EXIT_ON_CLOSE
) {
    pb = progressBar (
        minimum : 0,
        maximum : 100,
        value : 0
    )
}

frame.show()