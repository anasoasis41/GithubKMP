package com.riahi

import platform.UIKit.UIDevice


actual fun platformName(): String {
    return "${UIDevice.currentDevice.systemName()} ${UIDevice.currentDevice.systemVersion}"
}