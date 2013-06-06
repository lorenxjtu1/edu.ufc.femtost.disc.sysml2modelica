/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comte
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comte - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPortImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPortImpl#getType_connector <em>Type connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaPortImpl extends ModelicaComponentImpl implements ModelicaPort {
	/**
	 * The default value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaCausalityKind CAUSALITY_EDEFAULT = ModelicaCausalityKind.NONE;

	/**
	 * The cached value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected ModelicaCausalityKind causality = CAUSALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType_connector() <em>Type connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_connector()
	 * @generated
	 * @ordered
	 */
	protected Connector type_connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelicaPackage.Literals.MODELICA_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaCausalityKind getCausality() {
		return causality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausality(ModelicaCausalityKind newCausality) {
		ModelicaCausalityKind oldCausality = causality;
		causality = newCausality == null ? CAUSALITY_EDEFAULT : newCausality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_PORT__CAUSALITY, oldCausality, causality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getType_connector() {
		if (type_connector != null && type_connector.eIsProxy()) {
			InternalEObject oldType_connector = (InternalEObject)type_connector;
			type_connector = (Connector)eResolveProxy(oldType_connector);
			if (type_connector != oldType_connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelicaPackage.MODELICA_PORT__TYPE_CONNECTOR, oldType_connector, type_connector));
			}
		}
		return type_connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetType_connector() {
		return type_connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_connector(Connector newType_connector) {
		Connector oldType_connector = type_connector;
		type_connector = newType_connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_PORT__TYPE_CONNECTOR, oldType_connector, type_connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelicaPackage.MODELICA_PORT__CAUSALITY:
				return getCausality();
			case ModelicaPackage.MODELICA_PORT__TYPE_CONNECTOR:
				if (resolve) return getType_connector();
				return basicGetType_connector();
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
			case ModelicaPackage.MODELICA_PORT__CAUSALITY:
				setCausality((ModelicaCausalityKind)newValue);
				return;
			case ModelicaPackage.MODELICA_PORT__TYPE_CONNECTOR:
				setType_connector((Connector)newValue);
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
			case ModelicaPackage.MODELICA_PORT__CAUSALITY:
				setCausality(CAUSALITY_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_PORT__TYPE_CONNECTOR:
				setType_connector((Connector)null);
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
			case ModelicaPackage.MODELICA_PORT__CAUSALITY:
				return causality != CAUSALITY_EDEFAULT;
			case ModelicaPackage.MODELICA_PORT__TYPE_CONNECTOR:
				return type_connector != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (causality: ");
		result.append(causality);
		result.append(')');
		return result.toString();
	}

} //ModelicaPortImpl