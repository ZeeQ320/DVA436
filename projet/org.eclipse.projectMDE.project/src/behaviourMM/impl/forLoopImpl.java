/**
 */
package behaviourMM.impl;

import behaviourMM.Affectation;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.Operator;
import behaviourMM.forLoop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.forLoopImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link behaviourMM.impl.forLoopImpl#getConditionStop <em>Condition Stop</em>}</li>
 *   <li>{@link behaviourMM.impl.forLoopImpl#getStartValue <em>Start Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class forLoopImpl extends LoopImpl implements forLoop {
	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected Operator iteration;

	/**
	 * The cached value of the '{@link #getConditionStop() <em>Condition Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionStop()
	 * @generated
	 * @ordered
	 */
	protected Operator conditionStop;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected Affectation startValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected forLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.FOR_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getIteration() {
		if (iteration != null && iteration.eIsProxy()) {
			InternalEObject oldIteration = (InternalEObject)iteration;
			iteration = (Operator)eResolveProxy(oldIteration);
			if (iteration != oldIteration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourMMPackage.FOR_LOOP__ITERATION, oldIteration, iteration));
			}
		}
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator basicGetIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(Operator newIteration) {
		Operator oldIteration = iteration;
		iteration = newIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.FOR_LOOP__ITERATION, oldIteration, iteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getConditionStop() {
		return conditionStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionStop(Operator newConditionStop, NotificationChain msgs) {
		Operator oldConditionStop = conditionStop;
		conditionStop = newConditionStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.FOR_LOOP__CONDITION_STOP, oldConditionStop, newConditionStop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionStop(Operator newConditionStop) {
		if (newConditionStop != conditionStop) {
			NotificationChain msgs = null;
			if (conditionStop != null)
				msgs = ((InternalEObject)conditionStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.FOR_LOOP__CONDITION_STOP, null, msgs);
			if (newConditionStop != null)
				msgs = ((InternalEObject)newConditionStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.FOR_LOOP__CONDITION_STOP, null, msgs);
			msgs = basicSetConditionStop(newConditionStop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.FOR_LOOP__CONDITION_STOP, newConditionStop, newConditionStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartValue(Affectation newStartValue, NotificationChain msgs) {
		Affectation oldStartValue = startValue;
		startValue = newStartValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.FOR_LOOP__START_VALUE, oldStartValue, newStartValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(Affectation newStartValue) {
		if (newStartValue != startValue) {
			NotificationChain msgs = null;
			if (startValue != null)
				msgs = ((InternalEObject)startValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.FOR_LOOP__START_VALUE, null, msgs);
			if (newStartValue != null)
				msgs = ((InternalEObject)newStartValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.FOR_LOOP__START_VALUE, null, msgs);
			msgs = basicSetStartValue(newStartValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.FOR_LOOP__START_VALUE, newStartValue, newStartValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourMMPackage.FOR_LOOP__CONDITION_STOP:
				return basicSetConditionStop(null, msgs);
			case BehaviourMMPackage.FOR_LOOP__START_VALUE:
				return basicSetStartValue(null, msgs);
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
			case BehaviourMMPackage.FOR_LOOP__ITERATION:
				if (resolve) return getIteration();
				return basicGetIteration();
			case BehaviourMMPackage.FOR_LOOP__CONDITION_STOP:
				return getConditionStop();
			case BehaviourMMPackage.FOR_LOOP__START_VALUE:
				return getStartValue();
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
			case BehaviourMMPackage.FOR_LOOP__ITERATION:
				setIteration((Operator)newValue);
				return;
			case BehaviourMMPackage.FOR_LOOP__CONDITION_STOP:
				setConditionStop((Operator)newValue);
				return;
			case BehaviourMMPackage.FOR_LOOP__START_VALUE:
				setStartValue((Affectation)newValue);
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
			case BehaviourMMPackage.FOR_LOOP__ITERATION:
				setIteration((Operator)null);
				return;
			case BehaviourMMPackage.FOR_LOOP__CONDITION_STOP:
				setConditionStop((Operator)null);
				return;
			case BehaviourMMPackage.FOR_LOOP__START_VALUE:
				setStartValue((Affectation)null);
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
			case BehaviourMMPackage.FOR_LOOP__ITERATION:
				return iteration != null;
			case BehaviourMMPackage.FOR_LOOP__CONDITION_STOP:
				return conditionStop != null;
			case BehaviourMMPackage.FOR_LOOP__START_VALUE:
				return startValue != null;
		}
		return super.eIsSet(featureID);
	}

} //forLoopImpl
