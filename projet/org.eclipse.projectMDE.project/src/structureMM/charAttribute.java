/**
 */
package structureMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>char Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureMM.charAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see structureMM.StructureMMPackage#getcharAttribute()
 * @model
 * @generated
 */
public interface charAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"\'\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(char)
	 * @see structureMM.StructureMMPackage#getcharAttribute_Value()
	 * @model default="\'\'"
	 * @generated
	 */
	char getValue();

	/**
	 * Sets the value of the '{@link structureMM.charAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(char value);

} // charAttribute
