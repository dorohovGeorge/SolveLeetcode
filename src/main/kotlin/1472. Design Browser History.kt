class Node(var name: String) {
    var prev: Node? = null
    var next: Node? = null
}

class BrowserHistory(homepage: String?) {
    var p: Node

    init {
        p = Node(homepage!!)
    }

    fun visit(url: String?) {
        val cur = Node(url!!)
        cur.prev = p
        p.next = cur
        p = cur
    }

    fun back(steps: Int): String {
        var steps = steps
        while (steps > 0) {
            if (p.prev == null) return p.name
            p = p.prev!!
            steps--
        }
        return p.name
    }

    fun forward(steps: Int): String {
        var steps = steps
        while (steps > 0) {
            if (p.next == null) return p.name
            p = p.next!!
            steps--
        }
        return p.name
    }
}
