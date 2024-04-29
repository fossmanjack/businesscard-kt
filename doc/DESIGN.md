### Objective

Create a Linktree-esque single-page business card app

### Layout

#### ID Card (alignment: center/vcenter)
    (avi or picture)
    Jack Meyers (big font) (String: full_name)
    Title (String: full_title)

#### Links Block (alignment: center/vbottom)
    1 "BlockLine" composable for each entry
    (icon: phone)   Phone (String: phone_number) (link to dialout)
    (icon: web)     Portfolio (String: portfolio_title) (link to porfolio URL)
    (icon: matrix)  Matrix ID (String: matrix_id) (link to matrix.to)
    (icon: fedi)    Fedi ID (String: fedi_id) (link to fedi profile)
    (icon: email)   Email (string: email) (link to mailto)
    

#### BlockLine composable

- icon (Icon)
- content (String)
- linkTo (String)