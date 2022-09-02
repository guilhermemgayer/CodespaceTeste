rodar = 1
while rodar == 1:
    num = input("Advinhe o número: ")
    if num == 67:
        print(num)
        print("CORRETO!")
    else:
        print("ERRADO.")
        tentar = input("Tentar novamente? [S/N]: ")
        if tentar == "S" or tentar == "s":
            rodar = 1
        else:
            rodar = 0