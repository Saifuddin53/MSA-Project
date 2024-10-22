package com.myprojects.msa_project.presentation.util

fun getFormattedClosedBucket(closedBucket: String): String {
    return when {
        closedBucket.contains("LikelyOpen") -> "Open"
        closedBucket.contains("VeryLikelyClosed") -> "Closed"
        else -> "Unknown"
    }
}