# Antlr

## The way of solving problem with antlr

1. Construct g4 grammar
2. Viz the grammar tree to make sure it works
```shell script
grun Lisp prog -gui
(let x 2 (mult x (let x 3 y 4 (add x y))))
# Ctrl + d for EOF
```

![Lisp AST](https://blog-image-1258275666.cos.ap-chengdu.myqcloud.com/Lisp-AST.png)

3. Build up listener & walker & visitor with ParseTreeProperty to handle business

## TODO
1. How to add more useful information on ParseTree to make tree walk easier?
2. What is the systematic way to generate g4 grammar?
3. Why left recursion not works with LL(k) parsing algorithm?
