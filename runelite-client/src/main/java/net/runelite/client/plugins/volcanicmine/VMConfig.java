/*
 * Copyright (c) 2020, Hippipi <https://github.com/hippipi>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.volcanicmine;

import net.runelite.client.config.*;

@ConfigGroup("volcanicmine")
public interface VMConfig extends Config
{
    @ConfigItem(
            keyName = "ventWarning",
            name = "Vent Shift Warning",
            description = "Show warning for when vents shift 5 minutes into game",
            position = 0
    )
    default boolean showVentWarning()
    {
        return true;
    }

    @ConfigItem(
            keyName = "ventWarningTime",
            name = "Vent Shift Warning Time",
            description = "Seconds before vent shift warning",
            position = 1
    )
    @Range(
            max = 60,
            min = 1
    )
    @Units(Units.SECONDS)
    default int ventWarningTime()
    {
        return 25;
    }

    @ConfigItem(
            keyName = "eruptionWarning",
            name = "Eruption Warning",
            description = "Show warning for when the volcano is going to erupt",
            position = 2
    )
    default boolean showEruptionWarning()
    {
        return true;
    }

    @ConfigItem(
            keyName = "eruptionWarningTime",
            name = "Eruption Warning Time",
            description = "Seconds before eruption warning",
            position = 3
    )
    @Range(
            max = 60,
            min = 30
    )
    @Units(Units.SECONDS)
    default int eruptionWarningTime()
    {
        return 40;
    }

    @ConfigItem(
            keyName = "platformWarning",
            name = "Platform Warning",
            description = "Show warning for when platform below you is about to disappear",
            position = 4
    )
    default boolean showPlatformWarning()
    {
        return true;
    }
}
