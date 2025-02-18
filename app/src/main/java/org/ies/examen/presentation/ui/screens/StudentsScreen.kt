package org.ies.examen.presentation.ui.screens

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.ies.examen.domain.model.Student

@Composable
fun StudentsScreen() {
    /*TODO*/
    val students = listOf(
        Student("1","Bob", "Esponja", 20),
        Student("2","Pepa", "Pig", 7),
        Student("3","George", "Pig", 3)
    )
    Scaffold(
        floatingActionButton = {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "+")
            }
        }
    ) { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(students) { student ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(
                        text = "${student.name} ${student.surname}",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun StudentsScreenPreview() {
    StudentsScreen()
}