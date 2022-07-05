fun reverseList(head: ListNode?): ListNode? {
    var prev:ListNode? = null
    var current = head
    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
