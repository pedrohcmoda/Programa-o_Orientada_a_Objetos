#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

void insertAtEnd(struct Node** head_ref, int value) {
    struct Node* newNode = createNode(value);
    struct Node* current = *head_ref;

    if (*head_ref == NULL) {
        *head_ref = newNode;
        newNode->next = *head_ref;
        return;
    }

    while (current->next != *head_ref)
        current = current->next;

    current->next = newNode;
    newNode->next = *head_ref;
}

void displayList(struct Node* head) {
    struct Node* current = head;
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    printf("Circular Linked List:\n");
    do {
        printf("%d ", current->data);
        current = current->next;
    } while(current != head);
    printf("\n");
}

int main() {
    struct Node* head = NULL;

    insertAtEnd(&head, 1);
    insertAtEnd(&head, 2);
    insertAtEnd(&head, 3);
    insertAtEnd(&head, 4);

    displayList(head);

    return 0;
}
