/**
 */
package behaviourMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>write Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.writeConsole#getVariable <em>Variable</em>}</li>
 *   <li>{@link behaviourMM.writeConsole#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getwriteConsole()
 * @model
 * @generated
 */
public interface writeConsole extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourMM.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see behaviourMM.BehaviourMMPackage#getwriteConsole_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourMM.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see behaviourMM.BehaviourMMPackage#getwriteConsole_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operator> getOperation();

} // writeConsole
