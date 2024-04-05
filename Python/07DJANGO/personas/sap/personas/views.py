from django.forms import modelform_factory
from django.shortcuts import get_object_or_404, redirect, render
from django.views.decorators.csrf import csrf_protect

from personas.forms import PersonaForm
from personas.models import Persona

# Create your views here.

def detallePersona(request, id):
    persona = Persona.objects.get(pk=id)
    return render(request, 'personas/detalle.html', {'persona': persona})

#PersonaForm = modelform_factory(Persona, exclude=[])

@csrf_protect
def nuevaPersona(request):
    
    if request.method == 'POST':
        formPersona = PersonaForm(request.POST)
        if formPersona.is_valid():
            formPersona.save()
            return redirect('index')
        else:
            return render (request, 'personas/nuevo.html', {'formPersona': formPersona})
    else:
        formPersona = PersonaForm()
    return render (request, 'personas/nuevo.html', {'formPersona': formPersona})
    

def editarPersona(request, id):
    if request.method == 'POST':
        persona = get_object_or_404(Persona, pk=id)
        formPersona = PersonaForm(request.POST, instance=persona)
        if formPersona.is_valid():
            formPersona.save()
            return redirect('index')
        else:
            return render(request, 'personas/editar.html', {'formPersona': formPersona})
    else:
        persona = get_object_or_404(Persona, pk=id)
        formPersona = PersonaForm(instance=persona)
        return render(request, 'personas/editar.html', {'formPersona': formPersona})


def eliminarPersona(request, id):
    persona = get_object_or_404(Persona, pk=id)
    
    if persona:
        persona.delete()
        
    return redirect('index')