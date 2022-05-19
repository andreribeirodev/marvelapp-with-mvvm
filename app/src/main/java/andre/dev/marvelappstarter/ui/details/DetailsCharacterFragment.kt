package andre.dev.marvelappstarter.ui.details

import andre.dev.marvelappstarter.databinding.FragmentDetailsCharacterBinding
import andre.dev.marvelappstarter.ui.base.BaseFragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels

class DetailsCharacterFragment :
    BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>() {
    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding =
        FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}
