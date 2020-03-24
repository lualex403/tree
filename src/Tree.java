// TODO: Add any necessary import statements



/** This class represents a n-ary tree with potential subclasses like 
 *	binary tree, binary search tree, ,and expression tree.
 * @author ALEX
 */
public class Tree
{
	
	/** The value represented by the root of this tree.
	 */
	private Object myRootValue;
	
	/** The array of subtrees of the root of this tree.
	 */
	private Tree[] myChildren;
	
	
	/**  Initializes this tree with a given root value and branching
	 *
	 * @param rootValue			the value stored in the root of this tree
	 * @param branchinFactor	the number of children/subtrees
	 */
	public Tree(Object rootValue, int branchingFactor) {
		myRootValue=rootValue;
		myChildren= new Tree[branchingFactor];
		
	}
	
	
	
	/** returns the value stored in the root of this tree.
	 *
	 * @return 			returns the value stored in the root of this tree. 	
	 */
	public Object getValue() {
		return myRootValue;
	}
	
	
	
	/** returns the children of the tree
	 *
	 * @return 			returns the children of the tree
	 */
	public Tree[] getChildren() {
		return myChildren;
	}
	
	
	
	/** // check whether or the object is a leaf, the object has no more
	 * branches
	 *
	 * @return 			returns true or false
	 */
	public boolean isLeaf() {
		if(myChildren.length>0)
			return false;
		return true;
	}
	
	
	
	/** // returns the max height of the tree
	 *
	 * @return 			returns an integer
	 */
	public int maxHeight() {
		return -1;	// TODO: Implement this method correctly 
	}
	
	
	
	/** returns the number of elements in the tree
	 *
	 * @return 			returns an int
	 */
	public int size() {
		return -1;	// TODO: Implement this method correctly
	}
	
	
	/** // checks to see if object x is in the list
	 *
	 * @param x			the object x is being searched for
	 * @return 			returns true or false depending on 
	 * 					whether or not object x is in the 
	 * 					tree 
	 */
	public boolean breadthFirstSearch(Object x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @param x			the object x is being searched for
	 * @return 			returns true or false depending on 
	 * 					whether or not object x is in the 
	 * 					tree 
	 */
	public boolean depthFirstSearch(Object x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	@Override
	public String toString() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	@Override
	public boolean equals(Object x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	@Override
	public int hashCode() {
		return -1;	// TODO: Implement this method correctly
	}
	
	
}