fn main() {
    struct TreeNode<T> {
        val: T,
        left: Option<Box<TreeNode<T>>>,
        right: Option<Box<TreeNode<T>>>,
    }

    impl<T> TreeNode<T> {
        pub fn new(value: T) -> Self {
            TreeNode {
                val: value,
                left: None,
                right: None,
            }
        }

        pub fn add_left(&mut self, node: TreeNode<T>) -> &mut Self {
            self.left = Some(Box::new(node));
            self
        }

        pub fn add_right(&mut self, node: TreeNode<T>) -> &mut Self {
            self.right = Some(Box::new(node));
            self
        }

        pub fn get_value(&self) -> &T {
            &self.val
        }
    }

    let mut root_node = TreeNode::new(1);

    root_node.add_right(TreeNode::new(2))
        .add_left(TreeNode::new(3));
}
