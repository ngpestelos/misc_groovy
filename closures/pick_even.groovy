def pickEven(n, block) {
  for (int i = 2; i <= n; i += 2)
    block(i)
}

pickEven(10) { println it }
