/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.Operator;
import behaviourMM.elseConditionnal;
import behaviourMM.ifConditionnal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>if Conditionnal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.ifConditionnalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link behaviourMM.impl.ifConditionnalImpl#getElseC <em>Else C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ifConditionnalImpl extends ConditionnalImpl implements ifConditionnal {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Operator condition;

	/**
	 * The cached value of the '{@link #getElseC() <em>Else C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseC()
	 * @generated
	 * @ordered
	 */
	protected elseConditionnal elseC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ifConditionnalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.IF_CONDITIONNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Operator newCondition, NotificationChain msgs) {
		Operator oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.IF_CONDITIONNAL__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Operator newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.IF_CONDITIONNAL__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.IF_CONDITIONNAL__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.IF_CONDITIONNAL__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public elseConditionnal getElseC() {
		return elseC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseC(elseConditionnal newElseC, NotificationChain msgs) {
		elseConditionnal oldElseC = elseC;
		elseC = newElseC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C, oldElseC, newElseC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseC(elseConditionnal newElseC) {
		if (newElseC != elseC) {
			NotificationChain msgs = null;
			if (elseC != null)
				msgs = ((InternalEObject)elseC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C, null, msgs);
			if (newElseC != null)
				msgs = ((InternalEObject)newElseC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C, null, msgs);
			msgs = basicSetElseC(newElseC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C, newElseC, newElseC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourMMPackage.IF_CONDITIONNAL__CONDITION:
				return basicSetCondition(null, msgs);
			case BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C:
				return basicSetElseC(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourMMPackage.IF_CONDITIONNAL__CONDITION:
				return getCondition();
			case BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C:
				return getElseC();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourMMPackage.IF_CONDITIONNAL__CONDITION:
				setCondition((Operator)newValue);
				return;
			case BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C:
				setElseC((elseConditionnal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviourMMPackage.IF_CONDITIONNAL__CONDITION:
				setCondition((Operator)null);
				return;
			case BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C:
				setElseC((elseConditionnal)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviourMMPackage.IF_CONDITIONNAL__CONDITION:
				return condition != null;
			case BehaviourMMPackage.IF_CONDITIONNAL__ELSE_C:
				return elseC != null;
		}
		return super.eIsSet(featureID);
	}

} //ifConditionnalImpl
