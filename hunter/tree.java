/* Function to line by line print level order traversal a tree*/
static void printLevelOrder(Node root)
{
    int h = height(root);
    int i;
    for (i=1; i<=h; i++)
    {
        printGivenLevel(root, i);
        System.out.println();
    }
}
/* Print nodes at a given level */
void printGivenLevel(Node root, int level)
{
    if (root == null)
        return;
    if (level == 1)
        System.out.println(root.data);
    else if (level > 1)
    {
        printGivenLevel(root.left, level-1);
        printGivenLevel(root.right, level-1);
    }
}
