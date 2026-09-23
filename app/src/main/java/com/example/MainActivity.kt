package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.audio.QuranAudioPlayer
import com.example.data.repository.BeIslamicRepository
import com.example.ui.components.BottomNavBar
import com.example.ui.components.NavTab
import com.example.ui.components.TopHeaderBar
import com.example.ui.screens.*
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isDarkTheme by remember { mutableStateOf(false) }

            MyApplicationTheme(darkTheme = isDarkTheme) {
                BeIslamicApp(
                    isDarkTheme = isDarkTheme,
                    onToggleDarkTheme = { isDarkTheme = !isDarkTheme }
                )
            }
        }
    }
}

@Composable
fun BeIslamicApp(
    isDarkTheme: Boolean = false,
    onToggleDarkTheme: () -> Unit = {}
) {
    val context = LocalContext.current
    val repository = remember { BeIslamicRepository.getInstance(context) }
    val audioPlayer = remember { QuranAudioPlayer(context) }

    var currentTab by remember { mutableStateOf(NavTab.HOME) }
    var showProfileDialog by remember { mutableStateOf(false) }

    val subtitle = when (currentTab) {
        NavTab.HOME -> "Dashboard"
        NavTab.QURAN -> "Quran Reader & Audio"
        NavTab.LEARN -> "Islamic Education Hub"
        NavTab.SALAH -> "Method of Salah & Fiqh"
        NavTab.ASK -> "Evidence-First Assistant"
    }

    DisposableEffect(Unit) {
        onDispose {
            audioPlayer.stop()
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopHeaderBar(
                subtitle = subtitle,
                onSearchClick = { currentTab = NavTab.ASK },
                onReadingModeToggle = { currentTab = NavTab.QURAN },
                onProfileClick = { showProfileDialog = true }
            )
        },
        bottomBar = {
            BottomNavBar(
                currentTab = currentTab,
                onTabSelected = { currentTab = it }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.surface)
        ) {
            when (currentTab) {
                NavTab.HOME -> HomeScreen(
                    onContinueLesson = { currentTab = NavTab.SALAH },
                    onStudyVerses = { currentTab = NavTab.QURAN },
                    onReviewSalah = { currentTab = NavTab.SALAH },
                    onExamineHadith = { currentTab = NavTab.LEARN },
                    onViewProgressAudit = { currentTab = NavTab.ASK }
                )
                NavTab.QURAN -> QuranScreen(
                    repository = repository,
                    audioPlayer = audioPlayer
                )
                NavTab.LEARN -> LearnScreen(
                    repository = repository
                )
                NavTab.SALAH -> SalahScreen(
                    repository = repository
                )
                NavTab.ASK -> AskIslamicScreen(
                    repository = repository
                )
            }
        }
    }

    if (showProfileDialog) {
        ProfileSettingsDialog(
            repository = repository,
            isDarkTheme = isDarkTheme,
            onToggleDarkTheme = onToggleDarkTheme,
            onDismiss = { showProfileDialog = false }
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("BE ISLAMIC")
    }
}
