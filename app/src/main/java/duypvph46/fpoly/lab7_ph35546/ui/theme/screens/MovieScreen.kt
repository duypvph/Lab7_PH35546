package duypvph46.fpoly.lab7_ph35546.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import duypvph46.fpoly.lab7_ph35546.ListType
import duypvph46.fpoly.lab7_ph35546.MovieList.MovieColumn
import duypvph46.fpoly.lab7_ph35546.MovieList.MovieGrid
import duypvph46.fpoly.lab7_ph35546.MovieList.MovieRow
import duypvph46.fpoly.lab7_ph35546.MovieViewModel


@Composable
fun MovieScreen() {
    val movieViewModel:MovieViewModel= viewModel()
    val moviesState = movieViewModel.movies.observeAsState(initial = emptyList())
    val movies = moviesState.value

    var listType by remember { mutableStateOf(ListType.ROW) }

    Column(
        modifier = Modifier.safeDrawingPadding()
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { listType = ListType.ROW }) {
                Text(text = "Row")
            }
            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = { listType = ListType.COLUMN }) {
                Text(text = "Column")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = { listType = ListType.GRID }) {
                Text(text = "Grid")
            }
        }

        when (listType) {
            ListType.ROW -> MovieRow(movies = movies)
            ListType.COLUMN -> MovieColumn(movies = movies)
            ListType.GRID -> MovieGrid(movies = movies)
        }
    }


}