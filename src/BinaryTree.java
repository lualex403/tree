import java.util.List;
// TODO: Add any necessary import statements



/** // TODO: Write a description of the data structure that this class models
 *
 * @author xxxxx // TODO: Complete the "@author" tag by filling in your name
 */
public class BinaryTree extends Tree
{
	
	/** //TODO: describe the object instantiated by this constructor
	 *
	 * @param rootValue		xxxxx // TODO: describe the parameter
	 */
	public BinaryTree(Object rootValue) {
		super(rootValue, 2);
		
		// TODO: Implement this constructor correctly
	}
	
	
	
	/** //TODO: describe the object instantiated by this constructor
	 *
	 * @param rootValue		xxxxx // TODO: describe the parameter
	 * @param left			xxxxx // TODO: describe the parameter
	 * @param right			xxxxx // TODO: describe the parameter
	 */
	public BinaryTree(Object rootValue, BinaryTree left, BinaryTree right) {
		super(rootValue, 2);
		// TODO: Implement this constructor correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @param left			xxxxx // TODO: describe the parameter
	 */
	public void setLeft(BinaryTree left) {
		return;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @param right			xxxxx // TODO: describe the parameter
	 */
	public void setRight(BinaryTree right) {
		return;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @return 			xxxxx // TODO: describe the return value
	 */
	public BinaryTree getLeft() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @return 			xxxxx // TODO: describe the return value
	 */
	public BinaryTree getRight() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @return 			xxxxx // TODO: describe the return value
	 */

	public List<Object> inOrder() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @return 			xxxxx // TODO: describe the return value
	 */
	public List<Object> preOrder() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @return 			xxxxx // TODO: describe the return value
	 */
	public List<Object> postOrder() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** // TODO: describe function/purpose of this method
	 *
	 * @return 			xxxxx // TODO: describe the return value
	 */
	public List<Object> levelByLevel() {
		return null;	// TODO: Implement this method correctly
	}
	
	
}