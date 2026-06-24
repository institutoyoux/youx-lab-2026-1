function calcular(
    nota1: number, 
    nota2: number, 
    nota3: number
): number {
    return (nota1 + nota2 + nota3) / 3
}

const media: number = calcular(1,2,3)

console.log(media)