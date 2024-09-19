fun convertToBinary(number: Int): String {
    return Integer.toBinaryString(number)
}

fun main() {
    println("Программа преобразует введённое натуральное число из десятичной системы в двоичную.")

    while (true) {
        println("Введите натуральное число (или введите 'exit' для выхода):")
        val input = readln().trim()

        if (input.isEmpty()) {
            println("Ошибка: строка не должна быть пустой. Попробуйте снова.")
            continue
        }

        if (input.equals("exit", ignoreCase = true)) {
            println("Выход из программы.")
            break
        }

        val number = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            println("Ошибка: введите натуральное число. Попробуйте снова.")
            continue
        }

        if (number <= 0) {
            println("Ошибка: число должно быть натуральным (больше 0). Попробуйте снова.")
            continue
        }

        val binary = convertToBinary(number)
        println("Число $number в двоичной системе: $binary")
    }
}