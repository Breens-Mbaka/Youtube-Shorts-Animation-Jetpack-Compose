package com.breens.youtubeshortsclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.breens.youtubeshortsclone.ui.theme.Black300
import com.breens.youtubeshortsclone.ui.theme.YoutubeShortsCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YoutubeShortsCloneTheme {
                ChannelShortPlaying()
            }
        }
    }

    @Composable
    @Preview(showSystemUi = true)
    fun ChannelShortPlaying() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Black300),
            contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier.size(60.dp)) {
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp)),
                    painter = painterResource(id = R.drawable.channel_logo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Box(
                modifier = Modifier
                    .zIndex(2f)
                    .graphicsLayer {
                        translationX = 60f
                        translationY = 50f
                    }
            ) {
                Row(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(top = 20.dp)
                ) {
                    VideoPlayingAnimation()
                }
            }
        }
    }
}