package andre.dev.marvelappstarter.ui.list

import andre.dev.marvelappstarter.databinding.FragmentListCharacterBinding
import andre.dev.marvelappstarter.ui.base.BaseFragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>() {
    override val viewModel: ListCharacterViewModel by viewModels<ListCharacterViewModel> ()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding =
        FragmentListCharacterBinding.inflate(inflater, container, false)
}
