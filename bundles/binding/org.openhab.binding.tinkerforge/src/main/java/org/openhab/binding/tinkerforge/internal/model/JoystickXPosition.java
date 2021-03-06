/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import java.math.BigDecimal;
import org.openhab.binding.tinkerforge.internal.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joystick XPosition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.JoystickXPosition#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getJoystickXPosition()
 * @model superTypes="org.openhab.binding.tinkerforge.internal.model.JoystickDevice org.openhab.binding.tinkerforge.internal.model.MSensor<org.openhab.binding.tinkerforge.internal.model.MDecimalValue>"
 * @generated
 */
public interface JoystickXPosition extends JoystickDevice, MSensor<DecimalValue>
{

  /**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"joystick_xposition"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getJoystickXPosition_DeviceType()
   * @model default="joystick_xposition" unique="false" changeable="false"
   * @generated
   */
  String getDeviceType();
} // JoystickXPosition
