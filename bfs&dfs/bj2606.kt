
import java.util.Scanner

var n: Int = 0   //컴퓨터의 개수
var m: Int = 0   //바이러스 개수
var arr: ArrayList<ArrayList<Int>> = ArrayList()
var visited: ArrayList<Boolean> = ArrayList()
var cnt:Int=0

fun main() {
    var scan: Scanner = Scanner(System.`in`)
    n = scan.nextInt()
    m = scan.nextInt()
    for (i in 1..n+1) {
        arr.add(ArrayList())
    }
    for (j in 1..m) {
        var a = scan.nextInt()
        var b = scan.nextInt()
        arr.get(a).add(b)
        arr.get(b).add(a)

    }
    for(j in 1..n+1){
        visited.add(false)
    }
    visited[1]=true
    sol(1)
    System.out.println(cnt)
}

fun sol(x:Int) {

    for (i in 0..arr[x].size-1) {
        var num=arr.get(x).get(i)
        if (!visited.get(num)){
            visited[num]=true
            cnt++
            sol(num)
        }
    }


}