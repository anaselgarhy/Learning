section .data
  text db "Hello, World!", 10      ; 10 to new line '\n'

section .text
  global _start

_start:
  mov rax, 1
  mov rdi, 1
  mov rsi, text
  mov rdx, 14                     ; Tesxt length maby -\_(^_^)_/-
  syscall

  mov rax, 60                     ; end of program
  mov rdi, 0                      ; exit valu (0 sucss)
  syscall
