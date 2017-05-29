/**
 */
package behaviourMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditionnal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.Conditionnal#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getConditionnal()
 * @model abstract="true"
 * @generated
 */
public interface Conditionnal extends Statement {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see behaviourMM.BehaviourMMPackage#getConditionnal_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // Conditionnal
