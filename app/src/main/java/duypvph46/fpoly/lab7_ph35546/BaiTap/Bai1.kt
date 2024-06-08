package duypvph46.fpoly.lab7_ph35546.BaiTap

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import duypvph46.fpoly.lab7_ph35546.MainViewModel
import duypvph46.fpoly.lab7_ph35546.ui.theme.screens.MovieScreen

@Composable
fun Bai1(){
    val viewModel: MainViewModel = viewModel()
    val movies = viewModel.movies.observeAsState(emptyList())
    MovieScreen()
}