package com.example.courseapp.course_feature.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courseapp.R
import com.example.courseapp.course_feature.data.model.DataSource
import com.example.courseapp.course_feature.data.model.Topic
import com.example.courseapp.ui.theme.CourseAppTheme

@Composable
fun TopicItem(
    topic: Topic,
    modifier: Modifier
) {
    Card {
        Row {
            Image(
                modifier = modifier.size(68.dp,68.dp),
                painter = painterResource(id = topic.image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    modifier = modifier.padding(16.dp,16.dp,16.dp,8.dp),
                    text = stringResource(id = topic.name),
                    style = MaterialTheme.typography.bodyMedium
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        modifier = modifier.padding(16.dp,0.dp,8.dp,0.dp),
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null
                    )
                    Text(text = topic.assocCourses.toString(), style = MaterialTheme.typography.labelMedium)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview(){
    CourseAppTheme {
        TopicItem(topic =DataSource.topics[0], modifier = Modifier)
    }
}