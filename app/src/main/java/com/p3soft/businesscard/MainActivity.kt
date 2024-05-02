package com.p3soft.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                        modifier = Modifier
                            .padding(top = 128.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween,

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
            modifier = Modifier
                .clip(RoundedCornerShape(percent = 50))
        )
        Text(
            text = stringResource(R.string.full_name),
            modifier = modifier
                .padding(8.dp),
            fontSize = 32.sp,
        )
        Text(
            text = stringResource(R.string.title),
            modifier = modifier,
            fontSize = 24.sp,
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
        modifier = Modifier
            .padding(bottom = 16.dp),
    ) {
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_email_text),
        )
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_phone_text),
        )
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_fedi_text),
        )
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_matrix_text),
        )
        LinkLine(
            modifier = modifier,
            content = stringResource(R.string.id_portfolio_text),
        )
    }

}

@Composable
fun LinkLine(
    //icon: Icon = Icon(icon = appIcons.DisabledByDefault, contentDescription = "placeholder"),
    content: String = "",
    uri: String = "",
    icon: ImageVector = Icons.Default.Home,
    modifier: Modifier = Modifier
) {
    // This is a touchable Row containing an Icon and a String
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(width = 1.dp, color = Color.Magenta)
            .padding(horizontal = 32.dp),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "A placeholder icon",
            modifier = Modifier
                .border(width = 1.dp, color = Color.Blue),
        )

        Text (
            text = content,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(2f)
                .padding(8.dp)
                .border(width = 1.dp, color = Color.Red),
            textAlign = TextAlign.Left,
            color = Color.White,
        )
    }

}

@Composable
fun LinkLine(
    //icon: Icon = Icon(icon = appIcons.DisabledByDefault, contentDescription = "placeholder"),
    content: String = "",
    uri: String = "",
    icon: Int,
    modifier: Modifier = Modifier
) {
    // This is a touchable Row containing an Icon and a String
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(width = 1.dp, color = Color.Magenta)
            .padding(horizontal = 32.dp),
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = "A placeholder icon",
            modifier = Modifier
                .border(width = 1.dp, color = Color.Blue),
        )

        Text (
            text = content,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(2f)
                .padding(8.dp)
                .border(width = 1.dp, color = Color.Red),
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

/* NOTES

- Make the LinkLines IconButtons instead, with icon and text and clickable


 */