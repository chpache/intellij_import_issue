To reproduce the import optimization issue:

- run `./mill mill.bsp.BSP/install` in this directory
- import as a BSP project
- go to Tool.scala file
- optimize imports

`import speakeasy as se` disappear, but it is used in the class `Tool`.