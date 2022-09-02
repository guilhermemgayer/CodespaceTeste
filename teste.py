rodar = 1
while rodar == 1:
    num = int(input("Advinhe o número: "))
    if num == 67:
        print("CERTO")
        rodar = 0
    else:
        print("ERRADO.")
        tentar = input("Tentar novamente? [S/N]: ")
        if tentar == "S" or tentar == "s":
            rodar = 1
        else:
            rodar = 0