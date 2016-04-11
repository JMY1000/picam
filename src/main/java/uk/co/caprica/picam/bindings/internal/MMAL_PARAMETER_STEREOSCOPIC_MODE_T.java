/*
 * This file is part of picam.
 *
 * picam is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * picam is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with picam.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2016 Caprica Software Limited.
 */

package uk.co.caprica.picam.bindings.internal;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import uk.co.caprica.picam.enums.StereoscopicMode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static uk.co.caprica.picam.bindings.MmalParameters.MMAL_PARAMETER_STEREOSCOPIC_MODE;

public class MMAL_PARAMETER_STEREOSCOPIC_MODE_T extends ParameterStructure {

    public static class ByReference extends MMAL_PARAMETER_STEREOSCOPIC_MODE_T implements Structure.ByReference {
    };

    public static class ByValue extends MMAL_PARAMETER_STEREOSCOPIC_MODE_T implements Structure.ByValue {
    };

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList(
        "hdr",
        "mode",
        "decimate",
        "swap_eyes"
    ));

	public int mode;

	public int decimate;

	public int swap_eyes;

	public MMAL_PARAMETER_STEREOSCOPIC_MODE_T() {
		super(MMAL_PARAMETER_STEREOSCOPIC_MODE);
	}

	public MMAL_PARAMETER_STEREOSCOPIC_MODE_T(Pointer peer) {
		super(peer);
	}

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}