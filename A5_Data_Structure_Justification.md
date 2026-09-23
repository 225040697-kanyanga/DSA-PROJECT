# Task A5 — Data-Structure Justification 

For each structure below, the justification is tied to *what the task
actually does with the data*, not just a textbook definition.

## Array — Daily Service-Time Statistics (Task A4)
An array is appropriate here because the statistics task needs a
**fixed collection of already-completed service times that is visited
once, from start to finish, to accumulate totals**. There's no
requirement to insert a value in the middle, delete one, or resize the
collection while processing — every value is read exactly once during
the traversal that computes the total, average, highest, lowest and
count-over-10-minutes. An array gives constant-time indexed access
for that single linear pass, with no extra overhead (like pointer
following) that a linked structure would add for a job that never
needs insertion or deletion.

## Singly Linked List — Student Service Records (Task A2)
A linked list suits the service-records task because the set of
student records **grows and shrinks unpredictably during the day** as
students are added, served, and removed, and records must be
insertable at the beginning, the end, or a specific position. An
array would require shifting every following element whenever a
record is inserted or deleted at an arbitrary position, which gets
expensive as the list grows. A singly linked list handles this by
simply relinking a few pointers, which matches how the task is
actually used (insert at position 3, delete a record, search,
traverse) far more naturally than a fixed-size or shifting structure
would.

## Stack — Postfix Expression Evaluation (Task A3)
A stack fits postfix evaluation because the evaluation rule is
inherently **last-in-first-out**: when an operator is read, it must
be applied to the two operands that were *most recently* pushed, not
the oldest ones. Pushing numbers as they're read and popping the two
most recent values the moment an operator appears is exactly what a
stack is built to do — there is no need to access anything other than
the top of the stack at any point in the algorithm, so no other
structure is a better fit.

## Queue — Waiting Line (Task A1)
A queue is appropriate for the waiting line because the service
centre must serve students in **the same order they arrived**
(first-come-first-served), which is precisely first-in-first-out
behaviour. `enqueue()` on arrival and `dequeue()` when a student is
served preserve that order automatically without the program needing
to track or search for "who arrived first" separately — the structure
itself guarantees fairness of order, which is the whole point of the
task.
