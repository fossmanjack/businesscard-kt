package com.p3soft.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.p3soft.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

//val appIcons = Icons.Filled

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                        BlockID(
                            modifier = Modifier,
                        )
                        BlockLinks(
                            modifier = Modifier,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BlockID(modifier: Modifier = Modifier) {
    // Image
    // Text: Name
    // Text: Title
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ){
        Image(
            painter = painterResource(R.drawable.simpsons_headshot_2024_256),
            contentDescription = stringResource(R.string.avi_desc),
            modifier = modifier,
        )
        Text(
            text = stringResource(R.string.full_name),
            modifier = modifier,
        )
        Text(
            text = stringResource(R.string.title),
            modifier = modifier,
        )
    }
}

@Composable
fun BlockLinks(modifier: Modifier = Modifier) {
    // For now this is a set of LinkLines
    // Eventually I want this to be a bottom-growing list
    // with the line data passed from an array of "objects" or arrays
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_email_text),
        )
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_phone_text)
        )
    }

}

@Composable
fun LinkLine(
    //icon: Icon = Icon(icon = appIcons.DisabledByDefault, contentDescription = "placeholder"),
    content: String = "",
    uri: String = "",
    modifier: Modifier = Modifier
) {
    // This is a touchable Row containing an Icon and a String
    Row(
    ) {
        /*
        Icon(
            contentDescription = "A placeholder icon",
        )

         */
        Text (
            text = content,
            modifier = modifier,
            textAlign = TextAlign.Left,
            color = Color.White,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
    }
}