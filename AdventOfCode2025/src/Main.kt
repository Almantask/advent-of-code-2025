fun main() {
    val passwordSolver1 = day1.Part1("data/day1/RealDeal.txt")
    val password1 = passwordSolver1.solve()
    println("Part1 password: $password1")

    val passwordSolver2 = day1.Part2("data/day1/RealDeal.txt")
    val password2 = passwordSolver2.solve()
    println("Part2 password: $password2")
}